require bluez4.inc

SRC_URI[md5sum] = "bb0a5864b16c911993d2bceb839edb3c"
SRC_URI[sha256sum] = "b493530e0cf6798e578a6ce322f513d2ab9a9c1d1987e93acb96974e86b52f1e"
#MD5: expected "67fd9ad2852ce01f01b16ddd2336d1ea", got "bb0a5864b16c911993d2bceb839edb3c"
#SHA256: expected "922e1a9c894c8667fc92f536c26553e8f094a676e96fb409bc384dd70f5ddde7", got "b493530e0cf6798e578a6ce322f513d2ab9a9c1d1987e93acb96974e86b52f1e"
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_angstrom = "1"

DEPENDS += "libsndfile1"

PR = "${INC_PR}.0"

# Not all distros have a recent enough udev
BTUDEV = " --disable-udevrules"
BTUDEV_angstrom = " --enable-udevrules"
BTUDEV_shr = " --enable-udevrules"

EXTRA_OECONF += "${BTUDEV}"
