require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "20a784d103f8a5336dbb9bb5fcd660cf5f5932b2"

PV = "2009.11+${PR}+git${SRCREV}"
PR = "r5"
PE = "1"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap3-v2009.11;protocol=git \
           file://fw_env.config \
          "

S = "${WORKDIR}/git"

