require libgles-omap3.inc

# Not released yet
#DEFAULT_PREFERENCE = "-1"
PR = "r4"

SGXPV = "3_00_00_07"
IMGPV = "1.3.13.1397"

# Quality control is really poor on these SDKs, so hack around the latest madness:
FILES_${PN} += "${libdir}/*.so"
FILES_${PN}-dev = "${includedir}"

