require linux.inc

DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

SRCREV = "90e758af52ba803cba233fabee81176d99589f09"

PV = "2.6.29"
PR = "r1"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/tmlind/linux-omap-2.6.git;branch=master;protocol=git \
	   file://defconfig \
          "

SRC_URI_append = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://fix-install.patch;patch=1 \
           file://fix-audio-capture.patch;patch=1 \
           file://beagle-asoc.patch;patch=1 \
           file://smsc911x-1.patch;patch=1 \
           file://smsc911x-2.patch;patch=1 \
           file://smsc911x-3.patch;patch=1 \
           file://smsc911x-4.patch;patch=1 \
           file://dss2.patch;patch=1 \
           file://musb-otg.patch;patch=1 \
           file://mmc.patch;patch=1 \
           file://ads7846-detection.patch;patch=1 \
           file://neon-deadlock.patch;patch=1 \
           file://madc.patch;patch=1 \
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
