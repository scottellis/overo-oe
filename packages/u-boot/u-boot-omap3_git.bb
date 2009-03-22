require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "2dea1db2a3b7c12ed70bbf8ee50755089c5e5170"

PV = "2009.03+${PR}+git${SRCREV}"
PR = "r3"
PE = "1"

SRC_URI = "git://gitorious.org/u-boot-omap3/mainline.git;branch=omap3-dev;protocol=git \
           file://fw-env.patch;patch=1 \
           file://dss2.patch;patch=1 \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
