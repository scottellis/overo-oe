require linux-omap.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/linux-omap3-git/${MACHINE}"

SRCREV = "189f0e76832b4a2d3bcc0d973ed4240170e04c29"

PV = "2.6.27-omap1+${PR}+git${SRCREV}"
PR = "r0"

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

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

S = "${WORKDIR}/git"
