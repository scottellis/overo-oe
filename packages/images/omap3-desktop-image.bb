# X11 demo image for omap3

require omap3-console-image.bb

XSERVER ?= "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-input-keyboard \
"

IMAGE_LINGUAS = ""

IMAGE_INSTALL += " \
  ${XSERVER} \
  xserver-nodm-init \
  xauth \
  xhost \
  xset \
  xrandr \
  fontconfig-utils \
  ttf-dejavu-common \
  ttf-dejavu-sans \
  ttf-dejavu-sans-mono \
  ttf-arphic-uming \
  glibc-utils \
  glibc-charmap-utf-8 \
  glibc-binary-localedata-en-us \
  e-wm \
  e-wm-config-standard \
  e-wm-config-default \
#  angstrom-x11-base-depends \
#  angstrom-gpe-task-apps \
#  angstrom-gpe-task-base \
#  angstrom-gpe-task-game \
#  angstrom-gpe-task-pim \
#  angstrom-gpe-task-settings \
#  angstrom-zeroconf-audio \
#  angstrom-gnome-icon-theme-enable \
#  hicolor-icon-theme \
#  gnome-icon-theme \
  gnome-mplayer \
  gnome-games \
  gpe-scap \
  pidgin \
  abiword \
  gnumeric \
  exhibit \
  gimp \
  firefox \
  midori \
  swfdec-mozilla \
  xmms \
  claws-mail \
  synergy \
  x11vnc \
 "
