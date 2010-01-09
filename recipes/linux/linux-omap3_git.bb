require linux.inc

DEFAULT_PREFERENCE = "-1"

DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3|overo"

SRCREV = "1ae5c1a259fdfdd736a6f9986336f71911f4918b"

PV = "2.6.33-rc3+${PR}+git${SRCREV}"

# The main PR is now using MACHINE_KERNEL_PR, for omap3 see conf/machine/include/omap3.inc

SRC_URI = "git://www.sakoman.com/git/linux-omap-2.6.git;protocol=git \
	   file://defconfig \
          "

SRC_URI_append = " \
           file://${BOOT_SPLASH} \
           "

S = "${WORKDIR}/git"
