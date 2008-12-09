# X11 demo image for omap3

require omap3-console-image.bb

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us pt-br es-es"

E_CONFIG = " \
  e-wm-config-illume \
  e-wm-config-standard \
  e-wm-config-netbook \
  e-wm-config-default \
  e-wm-config-minimalist \
  e-wm-config-scaleable \
"

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
  omapfbplay \
  pidgin \
  swfdec-mozilla \
  synergy \
  vnc \
  x11vnc \
  xmms \
  xterm \
"

IMAGE_INSTALL += " \
  ${APPS} \
  angstrom-x11-base-depends \
  angstrom-gpe-task-base \
  angstrom-gpe-task-settings \
  angstrom-zeroconf-audio \
  angstrom-gnome-icon-theme-enable \
  cups \
  e-wm \
  ${E_CONFIG} \
  hicolor-icon-theme \
  gnome-cups-manager \
  gnome-icon-theme \
  mime-support \
  nautilus \
  ${XSERVER} \
 "
