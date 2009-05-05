DESCRIPTION = "Simple MPlayer frontend with lite Gnome integration"
HOMEPAGE = "http://kdekorte.googlepages.com/gnomemplayer"
LICENSE = "GPL"
DEPENDS = "gtk+ gconf dbus-glib"
RDEPENDS = "mplayer"
PR = "r0"

inherit autotools pkgconfig gconf

SRC_URI = "http://gnome-mplayer.googlecode.com/files/${P}.tar.gz \
   "

