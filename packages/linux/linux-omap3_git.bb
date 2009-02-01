require linux.inc

DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

DEFAULT_PREFERENCE = "-1"

SRCREV = "675e66d8261d3327bc467426f8a7e15ec8ffad2c"

PV = "2.6.29-rc2+${PR}+git${SRCREV}"
PR = "r1"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/tmlind/linux-omap-2.6.git;branch=master;protocol=git \
	   file://defconfig \
          "

SRC_URI_append = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://fix-install.patch;patch=1 \
           file://fix-audio-capture.patch;patch=1 \
           file://mru-fix-timings.diff;patch=1 \
           file://mru-fix-display-panning.diff;patch=1 \
           file://mru-improve-pixclock-config.diff;patch=1 \
           file://mru-make-video-timings-selectable.diff;patch=1 \
           file://mru-enable-overlay-optimalization.diff;patch=1 \
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
