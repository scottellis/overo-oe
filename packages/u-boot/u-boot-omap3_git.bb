require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "61fa2cb5bbbffa11c43c05c29ff32316ad589f51"

PV = "2008.10+${PR}+git${SRCREV}"
PR="r12"
PE = "1"

SRC_URI = "git://www.sakoman.net/git/u-boot-arm.git;branch=omap3-j24;protocol=git \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
