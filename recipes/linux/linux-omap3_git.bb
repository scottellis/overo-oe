require linux.inc

DEFAULT_PREFERENCE = "-1"

DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3|omap3evm|overo"

SRCREV = "a6da08dc9f3a1e4903a8a1649afe1759c469feeb"

PV = "2.6.31-rc7+${PR}+git${SRCREV}"

# The main PR is now using MACHINE_KERNEL_PR, for omap3 see conf/machine/include/omap3.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/tmlind/linux-omap-2.6.git;branch=master;protocol=git \
	   file://defconfig \
          "

SRC_URI_append = " \
           file://${BOOT_SPLASH} \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://fix-install.patch;patch=1 \
           file://fix-audio-capture.patch;patch=1 \
           file://dss2.patch;patch=1 \
           file://ads7846-detection.patch;patch=1 \
           file://neon-deadlock.patch;patch=1 \
           file://madc-driver.patch;patch=1 \
           file://madc.patch;patch=1 \
           file://quiet-single-block-retry-warning.patch;patch=1 \
           file://ehci-phy-reset.patch;patch=1 \
           file://0001-ARM-OMAP3-Fix-EHCI-initialization-for-Overo.patch;patch=1 \
           file://0001-ARM-OMAP3-Fix-EHCI-initialization-for-Beagle.patch;patch=1 \
           file://beagle-writable-uboot.patch;patch=1 \
           file://tincan.patch;patch=1 \
           "

S = "${WORKDIR}/git"
