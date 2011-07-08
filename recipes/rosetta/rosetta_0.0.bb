SECTION = "x11/utils"

PV = "0.0"
DEPENDS = "gtk+ libgpewidget virtual/libx11 libxrandr libxft libxtst libxext libxau \
	   virtual/libintl"
DESCRIPTION = "Multistroke / full word handwriting recognition for X"
LICENSE = "GPL"

SRC_URI = "http://cumulus.gumstix.org/sources/rosetta.tar.gz \
	   file://rosetta-makefile.patch"
S = "${WORKDIR}/rosetta"
PR = "r4"

inherit pkgconfig gettext

FILES_${PN} = "${sysconfdir} ${bindir} ${datadir}/pixmaps ${datadir}/applications ${datadir}/rosetta"

do_install () {
        oe_runmake PREFIX=${prefix} DESTDIR=${D} install-program
}

pkg_postinst () {
if test "x$D" != "x"; then
	exit 1
else
  ${prefix}/bin/rosetta -P
fi
}

SRC_URI[md5sum] = "b0c01590b673d4ea8cab20a12bc1aabf"
SRC_URI[sha256sum] = "afec0ab2a1fb30d1d66176e8b8c51a9a37fa45feb26363779b07bc1c9b75ade6"
