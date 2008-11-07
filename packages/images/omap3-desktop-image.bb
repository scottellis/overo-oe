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
  gnome-games \
  pidgin \
  abiword \
  gnumeric \
  gimp \
  e-wm exhibit \
  hicolor-icon-theme gnome-icon-theme \
  firefox \
  midori \
  swfdec-mozilla \
  gnome-mplayer \
  xmms \
  claws-mail \
  stalonetray \
 "
