require ../gcc/gcc-common.inc

SECTION = "libs"
DESCRIPTION = "Foreign Function Interface library"
LICENSE = "libffi"
PRIORITY = "optional"

inherit autotools gettext pkgconfig

PR = "r1"

S = "${WORKDIR}/${P}"

B = "${S}/build.${HOST_SYS}.${TARGET_SYS}"

PACKAGES = "${PN}-dbg ${PN} ${PN}-dev ${PN}-doc"

FILES_${PN} = "${libdir}/libffi.so.*"

FILES_${PN}-dev = "${libdir}/libffi-3.0.8/include/ffi* \
		   ${libdir}/libffi.a \
		   ${libdir}/libffi.la \
		   ${libdir}/libffi.so \
			 ${libdir}/pkgconfig \
"

SRC_URI = "ftp://sourceware.org/pub/libffi/${P}.tar.gz \
           file://autoconf-2.64.patch"

EXTRA_OECONF = "--with-gnu-ld \
                --enable-shared \
                --enable-target-optspace \
                --enable-languages=c,c++,f77 \
                --enable-threads=posix \
                --enable-multilib \
                --enable-c99 \
                --enable-long-long \
                --enable-symvers=gnu \
                --program-prefix=${TARGET_PREFIX} \
                ${EXTRA_OECONF_FPU} \
                ${EXTRA_OECONF_PATHS}"

EXTRA_OECONF_PATHS = "--with-local-prefix=${prefix}/local \
                      --with-gxx-include-dir=${includedir}/c++/${PV}"

# Build uclibc compilers without cxa_atexit support
EXTRA_OECONF_append_linux               = " --enable-__cxa_atexit"
EXTRA_OECONF_append_linux-gnueabi       = " --enable-__cxa_atexit"
EXTRA_OECONF_append_linux-uclibc        = " --disable-__cxa_atexit"
EXTRA_OECONF_append_linux-uclibceabi = " --disable-__cxa_atexit"
EXTRA_OECONF_FPU = "${@get_gcc_fpu_setting(bb, d)}"

#Somehow gcc doesn't set __SOFTFP__ when passing -mfloatabi=softp :(
TARGET_CC_ARCH_append_armv6 = " -D__SOFTFP__"
TARGET_CC_ARCH_append_armv7a = " -D__SOFTFP__"

SRC_URI[md5sum] = "188a4f79fdac2310044b44b7d3918ef9"
SRC_URI[sha256sum] = "2c7c5b88a68fb362262889ba25ef25dc27864b7bbf03547a8a36b8d567569406"
