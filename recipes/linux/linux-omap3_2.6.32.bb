DESCRIPTION = "Linux kernel for OMAP3 processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "beagleboard|omap3|overo"

require linux.inc

MUSB_MODE ?= "host"

SRCREV = "d434b954906c4f3e356d64d6b49675c601456f51"

PV = "2.6.32"

# The main PR is now using MACHINE_KERNEL_PR, for omap3 see conf/machine/include/omap3.inc

SRC_URI = "git://www.sakoman.com/git/linux-omap-2.6.git;branch=omap3-2.6.32;protocol=git \
	   file://defconfig \
          "

SRC_URI_append = " \
           file://${BOOT_SPLASH} \
           "

do_configure_prepend() {

        if [ "${MUSB_MODE}" = "host" ]; then
            sed -i 's:# CONFIG_USB_MUSB_HOST is not set:CONFIG_USB_MUSB_HOST=y:g' ${WORKDIR}/defconfig
            sed -i 's:CONFIG_USB_MUSB_PERIPHERAL=y:# CONFIG_USB_MUSB_PERIPHERAL is not set:g' ${WORKDIR}/defconfig
            sed -i 's:CONFIG_USB_MUSB_OTG=y:# CONFIG_USB_MUSB_OTG is not set:g' ${WORKDIR}/defconfig
            sed -i 's:# CONFIG_USB_MUSB_HDRC_HCD is not set:CONFIG_USB_MUSB_HDRC_HCD=y:g' ${WORKDIR}/defconfig
            sed -i 's:CONFIG_USB_GADGET_MUSB_HDRC=y:# CONFIG_USB_GADGET_MUSB_HDRC is not set:g' ${WORKDIR}/defconfig
        fi

        if [ "${MUSB_MODE}" = "peripheral" ]; then
            sed -i 's:CONFIG_USB_MUSB_HOST=y:# CONFIG_USB_MUSB_HOST is not set:g' ${WORKDIR}/defconfig
            sed -i 's:# CONFIG_USB_MUSB_PERIPHERAL is not set:CONFIG_USB_MUSB_PERIPHERAL=y:g' ${WORKDIR}/defconfig
            sed -i 's:CONFIG_USB_MUSB_OTG=y:# CONFIG_USB_MUSB_OTG is not set:g' ${WORKDIR}/defconfig
            sed -i 's:CONFIG_USB_MUSB_HDRC_HCD=y:# CONFIG_USB_MUSB_HDRC_HCD is not set:g' ${WORKDIR}/defconfig
            sed -i 's:# CONFIG_USB_GADGET_MUSB_HDRC is not set:CONFIG_USB_GADGET_MUSB_HDRC=y:g' ${WORKDIR}/defconfig
        fi

        if [ "${MUSB_MODE}" = "otg" ]; then
            sed -i 's:CONFIG_USB_MUSB_HOST=y:# CONFIG_USB_MUSB_HOST is not set:g' ${WORKDIR}/defconfig
            sed -i 's:CONFIG_USB_MUSB_PERIPHERAL=y:# CONFIG_USB_MUSB_PERIPHERAL is not set:g' ${WORKDIR}/defconfig
            sed -i 's:# CONFIG_USB_MUSB_OTG is not set:CONFIG_USB_MUSB_OTG=y:g' ${WORKDIR}/defconfig
            sed -i 's:CONFIG_USB_MUSB_HDRC_HCD=y:# CONFIG_USB_MUSB_HDRC_HCD is not set:g' ${WORKDIR}/defconfig
            sed -i 's:# CONFIG_USB_GADGET_MUSB_HDRC is not set:CONFIG_USB_GADGET_MUSB_HDRC=y:g' ${WORKDIR}/defconfig
        fi
}

S = "${WORKDIR}/git"
