require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "44fad552d091a8f2ab5a96c8505346add3d29530"

PV = "2009.11.1+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap3-v2009.11.1;protocol=git \
           file://fw_env.config \
          "

S = "${WORKDIR}/git"

