require linux.inc

DESCRIPTION = "Linux kernel for Gumstix Overo COM with MT9V032 support"
KERNEL_IMAGETYPE = "uImage"
COMPATIBLE_MACHINE = "overo"

BOOT_SPLASH ?= "logo_linux_clut224-generic.ppm"
MUSB_MODE ?= "host"

PV = "2.6.34"
PR = 102
S = "${WORKDIR}/git"

SRCREV = "cb89736af28f583598e49a05249334a194d00f1d"
SRC_URI = "git://www.sakoman.com/git/linux-omap-2.6.git;branch=omap3-2.6.34;protocol=git \
	   file://defconfig \
           file://mt9v032-2.6.34.patch \
           file://mt9v032-queryctl-ordering.patch \
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
