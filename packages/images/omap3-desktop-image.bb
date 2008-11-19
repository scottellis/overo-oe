# X11 demo image for omap3

require omap3-console-image.bb

XSERVER ?= "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-input-keyboard \
"

IMAGE_INSTALL += " \
  ${XSERVER} \
  angstrom-x11-base-depends \
  angstrom-gpe-task-apps \
  angstrom-gpe-task-base \
  angstrom-gpe-task-game \
  angstrom-gpe-task-pim \
  angstrom-gpe-task-settings \
  angstrom-zeroconf-audio \
  angstrom-gnome-icon-theme-enable \
  hicolor-icon-theme \
  gnome-icon-theme \
  gnome-mplayer \
  gnome-games \
  gpe-scap \
  pidgin \
  abiword \
  gnumeric \
  gimp \
  e-wm exhibit \
  firefox \
  midori \
  swfdec-mozilla \
  xmms \
  claws-mail \
  stalonetray \
  synergy \
  x11vnc \
 "
