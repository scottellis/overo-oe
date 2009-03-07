require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/"

SRCREV = "ddbf14ef6257ed6ba3abf969bcbc82fa495addfb"

PV = "2009.01+${PR}+git${SRCREV}"
PR = "r10"
PE = "1"

SRC_URI = "git://gitorious.org/u-boot-omap3/mainline.git;branch=omap3-dev;protocol=git \
           file://fw-env.patch;patch=1 \
           file://dss2.patch;patch=1 \
          "

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
