DESCRIPTION = "Kernel drivers for the PowerVR SGX chipset found in the omap3 SoCs"
LICENSE = "GPLv2"

PR = "r1"

inherit module

SRCREV = "5ca485c6d45a3e24f0e7fd0784465d65c475a3d2"

SRC_URI = "git://www.sakoman.net/git/omap3-sgx.git;branch=master;protocol=git \
          "
PVRBUILD = "release"

MAKE_TARGETS = " BUILD=${PVRBUILD}"

S = "${WORKDIR}/git"

do_install() {
	mkdir -p ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/gpu/pvr
	cp ${S}/pvrsrvkm.ko ${S}/services4/3rdparty/dc_omap3430_linux/omaplfb.ko ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/gpu/pvr
}


