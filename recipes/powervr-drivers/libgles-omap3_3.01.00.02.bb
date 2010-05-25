BINLOCATION = "${S}/gfx_rel_es3.x"

require libgles-omap3.inc

PR = "r7"

# download required binary distribution from:
# http://software-dl.ti.com/dsps/dsps_public_sw/sdo_sb/targetcontent/gfxsdk/latest/index_FDS.html
# see libgles-omap3.inc for detailed installation instructions

SGXPV = "3_01_00_02"
IMGPV = "1.4.14.2514"
BINFILE := "OMAP35x_Graphics_SDK_setuplinux_${SGXPV}.bin"

SRC_URI[md5sum] = "7e07019aa76dcdebaa8958df0f89bbe6"
SRC_URI[sha256sum] = "151d7ce8cbf192a3f0c7e232a5b958cde224309be9ec74ca40031be7d27fa265"
