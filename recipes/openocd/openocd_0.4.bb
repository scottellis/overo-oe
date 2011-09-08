DESCRIPTION = "Free and Open On-Chip Debugging, In-System Programming and Boundary-Scan Testing"
HOMEPAGE = "http://openocd.berlios.de/"
LICENSE = "GPL"
SRCREV = "56e74908d17d740db0a376f354c21e6608e8af8d"
PV = "0.4"
PR = "r0"

DEPENDS = "libftdi"
EXTRA_OECONF = " --enable-ft2232_libftdi --disable-werror --enable-maintainer-mode"

SRC_URI = "git://openocd.git.sourceforge.net/gitroot/openocd/openocd;protocol=git;branch=master \
          file://make-include-path-relative.patch"
S = "${WORKDIR}/git"

inherit autotools

do_configure_append() {
	for i in $(find ${S} -name Makefile) ; do
		sed -i -e 's:-I/usr/include:${STAGING_INCDIR}:g' $i
		sed -i -e 's:-L/usr/lib:-L${STAGING_LIBDIR}:g' $i
	done
}

