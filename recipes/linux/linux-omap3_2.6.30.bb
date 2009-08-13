require linux.inc

DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

SRCREV = "151c7a7fc30cceb58e7999adbf3ad5e0c734b4a7"

PV = "2.6.30"

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
           file://musb-otg.patch;patch=1 \
           file://ads7846-detection.patch;patch=1 \
           file://neon-deadlock.patch;patch=1 \
           file://madc.patch;patch=1 \
           file://quiet-single-block-retry-warning.patch;patch=1 \
           file://rc8-to-final.diff;patch=1 \
           file://omap-hsmmc-001.patch;patch=1 \
           file://omap-hsmmc-002.patch;patch=1 \
           file://omap-hsmmc-003.patch;patch=1 \
           "

SRC_URI_append_beagleboard = " \
           file://beagle-ehci.patch;patch=1 \
           file://beagle-writable-uboot.patch;patch=1 \
           file://tincan.patch;patch=1 \
          "

SRC_URI_append_omap3evm = " \
          "

SRC_URI_append_overo = " \
           file://overo-ehci.patch;patch=1 \
          "

S = "${WORKDIR}/git"
