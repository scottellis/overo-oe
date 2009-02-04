require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "30a78bbb1a149b2935701a34b9312fe372923618"

PV = "2009.01+${PR}+git${SRCREV}"
PR = "r5"
PE = "1"

SRC_URI = "git://gitorious.org/u-boot-omap3/mainline.git;branch=omap3-dev;protocol=git \
          "
SRC_URI_append_overo = "file://overo-fw-env.patch;patch=1"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
