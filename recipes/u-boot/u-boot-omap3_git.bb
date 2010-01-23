require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "4f9a9d30be516294e4a474101efcc7e29b17cb98"

PV = "2009.11+${PR}+git${SRCREV}"
PR = "r4"
PE = "1"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap3;protocol=git \
           file://fw_env.config \
          "

S = "${WORKDIR}/git"

