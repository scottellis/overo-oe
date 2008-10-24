require linux-omap.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/linux-omap3-git/${MACHINE}"

SRCREV = "86c0ce479d4bf67b885e9b7ed25d4997e4f30851"

PV = "2.6.27+${PR}+git${SRCREV}"
PR = "r2"

SRC_URI = "git://source.mvista.com/git/linux-omap-2.6.git;branch=master;protocol=git \
	   file://defconfig"

SRC_URI_append_beagleboard = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
          "

SRC_URI_append_omap3evm = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
          "

SRC_URI_append_overo = " \
           file://logo_linux_clut224.ppm \
           file://no-empty-flash-warnings.patch;patch=1 \
           file://overo.patch;patch=1 \
          "

COMPATIBLE_MACHINE = "beagleboard|omap3evm|overo"

S = "${WORKDIR}/git"
