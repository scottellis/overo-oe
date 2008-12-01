require linux.inc

DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

SRCREV = "75b7ae0e97f0862a13df9a6ac036ad0865b6703d"

PV = "2.6.28-rc6+${PR}+git${SRCREV}"
PR = "r3"

SRC_URI = "git://source.mvista.com/git/linux-omap-2.6.git;branch=master;protocol=git \
	   file://defconfig \
          "

SRC_URI_append = " \
           file://mru-fix-timings.diff;patch=1 \
           file://mru-fix-display-panning.diff;patch=1 \
           file://mru-make-dpll4-m4-ck-programmable.diff;patch=1 \
           file://mru-add-clk-get-parent.diff;patch=1 \
           file://mru-improve-pixclock-config.diff;patch=1 \
           file://mru-make-video-timings-selectable.diff;patch=1 \
           file://mru-enable-overlay-optimalization.diff;patch=1 \
          "

SRC_URI_append_beagleboard = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://beagleboard.patch;patch=1 \
          "

SRC_URI_append_omap3evm = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://omap3evm.patch;patch=1 \
          "

SRC_URI_append_overo = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://overo.patch;patch=1 \
          "


S = "${WORKDIR}/git"
