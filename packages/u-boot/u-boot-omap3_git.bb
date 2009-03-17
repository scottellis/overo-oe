require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "4eecc8639b2a45f156246aced55ea1cbcc63afff"

PV = "2009.03+${PR}+git${SRCREV}"
PR = "r1"
PE = "1"

SRC_URI = "git://gitorious.org/u-boot-omap3/mainline.git;branch=omap3-dev;protocol=git \
           file://fw-env.patch;patch=1 \
           file://dss2.patch;patch=1 \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
