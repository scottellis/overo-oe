require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "94d0ae5fab33d430d56164ad89a4e3613d90f111"

PV = "2009.1+${PR}+git${SRCREV}"
PR="r2"
PE = "1"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=omap3-dev;protocol=git \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
