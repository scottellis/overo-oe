# X11 demo image for omap3

require omap3-console-image.bb

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us pt-br es-es"

APPS = " \
  abiword \
  claws-mail \
  evince \
  exhibit \
  firefox \
  gimp \
  gnome-games \
  gnome-mplayer \
  gnumeric \
  gpe-soundbite \
  midori \
  pidgin \
  swfdec-mozilla \
  synergy \
#  totem \
  vnc \
  x11vnc \
  xmms \
  xterm \
"

IMAGE_INSTALL += " \
  ${APPS} \
  angstrom-x11-base-depends \
  angstrom-gpe-task-base \
  angstrom-zeroconf-audio \
  angstrom-gnome-icon-theme-enable \
  cups \
  metacity \
  hicolor-icon-theme \
  gnome-control-center \
  gnome-cups-manager \
  gnome-icon-theme \
  gnome-panel \
  gnome-session \
  gnome-settings-daemon \
  mime-support \
  nautilus \
  psplash \
  ${XSERVER} \
 "
