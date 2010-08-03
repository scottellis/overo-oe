DESCRIPTION = "Firmware for libertas_sdio"
LICENSE = "unknown"

SRC_URI = "file://sd8686.bin \
           file://sd8686_helper.bin \
          "

S = "${WORKDIR}"

do_install() {
	install -d ${D}/${base_libdir}/firmware
	install -m 0644 ${S}/sd8686.bin ${D}/${base_libdir}/firmware/
	install -m 0644 ${S}/sd8686_helper.bin ${D}/${base_libdir}/firmware/
}

FILES_${PN} = "${base_libdir}/firmware/"
PACKAGE_ARCH = "all"
