DEFAULT_PREFERENCE = "-1"

DEPENDS += "cairo sqlite3 libnotify"

# The .pc files below have "3.6" hardcoded, fix that before using them in a newer FF version!
SRC_URI = "ftp://ftp.mozilla.org/pub/mozilla.org/firefox/releases/${PV}/source/firefox-${PV}.source.tar.bz2;name=archive \
	file://jsautocfg.h \
	file://security-cross.patch \
	file://Bug339782.additional.fix.diff \
	file://Bug385583.nspr.jmp_buf.eabi.diff \
	file://Bug405992.atomic.nspr.diff \
	file://jemalloc-tls.patch \
	file://0001-Remove-Werror-from-build.patch \
	file://0002-Fix-security-cross-compile-cpu-detection-error.patch \
	file://plugins-dir.patch \
	file://firefox-plugin.pc \
	file://firefox-xpcom.pc \
	file://nspr.pc \
"

SRC_URI[archive.md5sum] = "c9a071b31bb90d05edfb93117d0a7537"
SRC_URI[archive.sha256sum] = "59b87271f940684f51cdd6becbcfdaf99a5a5880948ba07cefd07474c9ab06b3"

S = "${WORKDIR}/mozilla-1.9.2"

inherit mozilla
require firefox.inc

EXTRA_OECONF += " --enable-official-branding --disable-crashreporter"


FULL_OPTIMIZATION = "-fexpensive-optimizations -fomit-frame-pointer -frename-registers -O2"

do_compile_prepend() {
	cp ${WORKDIR}/jsautocfg.h ${S}/js/src/
	sed -i "s|CPU_ARCH =|CPU_ARCH = ${TARGET_ARCH}|" security/coreconf/Linux.mk
}
