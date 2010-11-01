DEFAULT_PREFERENCE = "-1"
require linux.inc

DESCRIPTION = "Linux kernel for OMAP processors"
KERNEL_IMAGETYPE = "uImage"

CORTEXA8FIXUP = "no"

COMPATIBLE_MACHINE = "beagleboard|omap3-multi|overo"

BOOT_SPLASH ?= "logo_linux_clut224-generic.ppm"
PV = "2.6.35"

S = "${WORKDIR}/git"

SRCREV = "a822ff2bb3d2861aeb16cdd908068f2d2937f365"
SRC_URI = "git://www.sakoman.com/git/linux-omap-2.6.git;branch=omap3-2.6.35;protocol=git \
	   file://defconfig \
           file://${BOOT_SPLASH} \
           "


