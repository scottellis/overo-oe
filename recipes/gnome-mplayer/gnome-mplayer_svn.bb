require gnome-mplayer.inc

SRCREV = "1634"
PV = "0.9.8+svnr${SRCPV}"
PR = "r1"
S = "${WORKDIR}/trunk"

SRC_URI = "svn://gnome-mplayer.googlecode.com/svn/;module=trunk;proto=http \
           file://default.patch;patch=1 \
          "

#hack, should use CXX to link:
LDFLAGS_append = " -lstdc++ "
