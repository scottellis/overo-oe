require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "79effa06460c6080c713718ccec672c60c2990a3"

PV = "2010.6+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap4-next-upstream;protocol=git \
          "

S = "${WORKDIR}/git"

