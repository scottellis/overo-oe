require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "8442875f1d8f24dd79ecf8199046cda1677b1d5a"

PV = "2009.1+${PR}+git${SRCREV}"
PR="r1"
PE = "1"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=omap3-dev;protocol=git \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
