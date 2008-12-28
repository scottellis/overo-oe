require linux.inc

DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

SRCREV = "e119a1d7e8b95618627b95ea7db7a39204b7e3d4"

PV = "2.6.28-rc9+${PR}+git${SRCREV}"
PR = "r2"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/tmlind/linux-omap-2.6.git;branch=master;protocol=git \
	   file://defconfig \
          "

SRC_URI_append = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://fix-install.patch;patch=1 \
           file://mru-fix-timings.diff;patch=1 \
           file://mru-fix-display-panning.diff;patch=1 \
           file://mru-improve-pixclock-config.diff;patch=1 \
           file://mru-make-video-timings-selectable.diff;patch=1 \
           file://mru-enable-overlay-optimalization.diff;patch=1 \
          "

SRC_URI_append_beagleboard = " \
           file://beagleboard.patch;patch=1 \
          "

SRC_URI_append_omap3evm = " \
           file://omap3evm.patch;patch=1 \
          "

SRC_URI_append_overo = " \
           file://overo.patch;patch=1 \
          "


S = "${WORKDIR}/git"
