DESCRIPTION = "The GIMP is the GNU Image Manipulation Program."
HOMEPAGE = "http://www.gimp.org"
SECTION = "x11/graphics"
LICENSE = "GPL"

DEPENDS = "sed-native gdk-pixbuf-csource-native libart-lgpl gtk+ jpeg libpng libexif tiff"

SRC_URI = "ftp://ftp.gimp.org/pub/gimp/v2.3/gimp-${PV}.tar.bz2 \
                 file://configure-libwmf.patch"

inherit gnome

FILES_gimp-dbg =+ "${libdir}/gimp/2.0/modules/.debug \
                   ${libdir}/gimp/2.0/plug-ins/.debug"

#Don't laugh, this just builds a threaded gimp
EXTRA_OECONF = " --disable-gtktest \
                --disable-print \
                --disable-python \
                --enable-mp \
                --without-libwmf"

do_configure_append() {
        find ${S} -name Makefile | xargs sed -i s:'-I$(includedir)':'-I.':g
        find ${S} -name Makefile | xargs sed -i s:'-I/usr/include':'-I${STAGING_INCDIR}':g
        find ${S} -name Makefile | xargs sed -i s:'file-wmf$(EXEEXT)':'':g
}

do_install_append() {
	install -d install -d ${D}${datadir}/pixmaps
	install -m 0755 ${S}/desktop/48x48/gimp.png ${D}${datadir}/pixmaps/
}

do_stage() {
        autotools_stage_all
}

python populate_packages_prepend () {
	cv_libdir = bb.data.expand('${libdir}', d)
	do_split_packages(d, cv_libdir, '^lib(.*)\.so\.*', 'lib%s', 'GIMP %s library', extra_depends='', allow_links=True)
}

FILES_${PN} =  "${bindir} ${sysconfdir} ${datadir}/gimp* ${libdir}/gimp* \
                ${datadir}/applications \
                ${datadir}/icons \
                ${datadir}/pixmaps \
                ${datadir}/mime-info \
		${datadir}/application-registry "

FILES_${PN}-dbg += "${libdir}/gimp/2.0/plug-ins/.debug \
                    ${libdir}/gimp/2.0/modules/.debug"

