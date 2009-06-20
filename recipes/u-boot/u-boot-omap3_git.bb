require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "015099988e2eb29fd1b7fe81058020185049a495"

PV = "2009.06-rc2+${PR}+git${SRCREV}"
PR = "r0"
PE = "1"

SRC_URI = "git://gitorious.org/u-boot-omap3/mainline.git;branch=omap3-dev;protocol=git \
           file://fw-env.patch;patch=1 \
           file://dss2.patch;patch=1 \
          "

S = "${WORKDIR}/git"

