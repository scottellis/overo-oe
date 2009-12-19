DEFAULT_PREFERENCE = "-1"

DESCRIPTION = "Kernel drivers for the PowerVR SGX chipset found in the omap3 SoCs"
LICENSE = "GPLv2"

PR = "r1"

inherit module

SRCREV = "acd807ae73bf21af4c0154f7abdd7964e4da3660"

SRC_URI = "git://www.sakoman.net/git/omap3-sgx.git;branch=master;protocol=git \
          "
PVRBUILD = "release"

MAKE_TARGETS = " BUILD=${PVRBUILD}"

S = "${WORKDIR}/git"

do_install() {
	mkdir -p ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/gpu/pvr
	cp ${S}/pvrsrvkm.ko ${S}/services4/3rdparty/dc_omap3430_linux/omaplfb.ko ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/gpu/pvr
}


