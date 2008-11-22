require linux-omap.inc
DESCRIPTION = "Linux kernel for OMAP3 processors"

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/linux-omap3-git/${MACHINE}"

SRCREV = "3b7de4be879f1f4f55ae59882a5cbd80f6dcf0f0"

PV = "2.6.28-rc6+${PR}+git${SRCREV}"
PR = "r1"

SRC_URI = "git://source.mvista.com/git/linux-omap-2.6.git;branch=master;protocol=git \
	   file://defconfig"

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
