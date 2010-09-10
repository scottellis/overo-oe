require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "381ea7010f4d5e2d4b1299fa44b3c7a4914040aa"

PV = "2010.6+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap4-next-upstream;protocol=git \
          "

S = "${WORKDIR}/git"

