PR = "${INC_PR}.0"

include squid.inc

EXTRA_OECONF += "--enable-storeio=null,ufs"

SRC_URI += "file://fix_epoll_check.patch \
	   file://squidv2-build-cf_gen.patch"

SRC_URI[squid-2.6.STABLE14.md5sum] = "eadb138d48320df8b99349121159c6bf"
SRC_URI[squid-2.6.STABLE14.sha256sum] = "dcb0c10965430862721b675e2f9f6a30819880e03124b5e9403bfce2c7f3b69a"