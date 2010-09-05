require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "913df3c03854f5ea4c9913f8e563adfdaa24e968"

PV = "2010.6+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap4-next-upstream;protocol=git \
          "

S = "${WORKDIR}/git"

