require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "cec8e2c99055ddeaae716ed804cf49669ee38999"

PV = "2008.10+${PR}+git${SRCREV}"
PR="r10"
PE = "1"

SRC_URI = "git://www.sakoman.net/git/u-boot-arm.git;branch=omap3-dev;protocol=git \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
