require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "327f51adacfe8c7b633f90306d646ae03e098554"

PV = "2009.11.1+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=omap3-v2009.11.1;protocol=git \
           file://fw_env.config \
          "

S = "${WORKDIR}/git"

