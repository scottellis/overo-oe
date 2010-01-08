SOC_FAMILY = "omap3-soc"

require conf/machine/include/tune-cortexa8.inc

# Increase this everytime you change something in the kernel
MACHINE_KERNEL_PR = "r51"

KERNEL_IMAGETYPE = "uImage"

UBOOT_ENTRYPOINT = "0x80008000"
UBOOT_LOADADDRESS = "0x80008000"

# Only build u-boot, xload is optional
EXTRA_IMAGEDEPENDS += "u-boot-omap3"

# TI DVSDK stuff:
# DSPLink rebuild
DSPLINKDSPCFG     ?= "OMAP3530SHMEM"
DSPLINKGPPOS      ?= "OMAPLSP"
DSPLINKPLATFORM   ?= "OMAP3530"
DSPLINKSOC        ?= "3530"


DISTRO_SSH_DAEMON = "openssh-sshd"

