require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "65b6948a2c7eb9675228aab2c108f106e73f268c"

PV = "2010.6+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap4-next-upstream;protocol=git \
          "

S = "${WORKDIR}/git"

