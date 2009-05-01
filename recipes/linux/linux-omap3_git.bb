require linux.inc

DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

DEFAULT_PREFERENCE = "-1"

SRCREV = "76653de0cebb7896ba375479b097b01ec825de66"

PV = "2.6.30-rc4+${PR}+git${SRCREV}"
PR = "r0"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/tmlind/linux-omap-2.6.git;branch=master;protocol=git \
	   file://defconfig \
          "

SRC_URI_append = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://fix-install.patch;patch=1 \
           file://fix-audio-capture.patch;patch=1 \
           file://dss2.patch;patch=1 \
           file://musb-otg.patch;patch=1 \
           file://ads7846-detection.patch;patch=1 \
           file://neon-deadlock.patch;patch=1 \
           "

SRC_URI_append_beagleboard = " \
           file://beagle-ehci.patch;patch=1 \
          "

SRC_URI_append_omap3evm = " \
          "

SRC_URI_append_overo = " \
           file://overo-ehci.patch;patch=1 \
          "


S = "${WORKDIR}/git"
