# gpe image for omap3 machines with lcd/touchscreen + midori

require omap3-console-image.bb

IMAGE_INSTALL += " \
  alsa-utils \
  alsa-utils-alsactl \
  alsa-utils-alsamixer \
  alsa-utils-aplay \
  angstrom-gpe-task-apps \
  angstrom-gpe-task-base \
  angstrom-gpe-task-game \
  angstrom-gpe-task-pim \
  angstrom-gpe-task-settings \
  angstrom-x11-base-depends \
  cellwriter \
  midori \
  psplash \
  xmms \
  xrefresh \
 "

