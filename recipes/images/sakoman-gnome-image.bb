# Gnome demo image

require omap3-console-image.bb

IMAGE_LINGUAS = "en-gb en-us de-de es-es fr-fr ja-jp"
ROOTFS_POSTPROCESS_COMMAND += 'install_linguas;'

IMAGE_LOGIN_MANAGER = "shadow"

ANGSTROM_EXTRA_INSTALL ?= ""

SPLASH = "psplash-angstrom"

DEPENDS = "gst-plugins-ugly"

APPS = " \
  abiword-meta \
  cheese \
  claws-mail \
  epiphany epiphany-extensions \
  swfdec swfdec-gnome swfdec-mozilla \
  evince evince-nautilus-extension\
  firefox gecko-mediaplayer-firefox-hack \
  gcalctool \
  gedit gedit-plugins \
  gftp \
  gimp \
  gnome-games gnome-games-extra-data \
  gnome-mplayer \
  gnumeric \
  gphoto2 \
  gthumb \
  libgles-omap3-demos \
  pidgin \
  synergy \
  vnc \
  x11vnc \
  xterm \
 "

DEV = " \
  geany \
  gtk+-dev \
  ldd \
  libltdl \
  libtool libtool-dev \
  pkgconfig \
  task-native-sdk \
 "

FONTS = " \
  encodings \
  font-adobe-75dpi \
  fontconfig fontconfig-utils font-util \
  ttf-arphic-uming \
  ttf-dejavu-common \
  ttf-dejavu-sans \
  ttf-dejavu-serif \
  ttf-dejavu-sans-mono \
  ttf-liberation-sans \
  ttf-liberation-serif \
  ttf-liberation-mono \
  xorg-minimal-fonts \
 "  

GNOME = " \
  at-spi \
  file-roller \
  gconf gconf-editor \
  gdm \
  gnome-control-center \
  gnome-applets \
  gnome-backgrounds \
  gnome-bluetooth \
  gnome-desktop \
#  gnome-disk-utility \
  gnome-doc-utils \
  gnome-keyring gnome-keyring-pam-plugin libpam-meta \
  gnome-media \
  gnome-menus \
  gnome-mime-data \
  gnome-mount \
#  gnome-packagekit packagekit packagekit-gtkmodule \
  gnome-panel libpanel-applet libgweather-locationdata\
  gnome-power-manager gnome-power-manager-applets \
  gnome-python gnome-python-extras \
  gnome-python-desktop \
  gnome-screensaver \
  gnome-session \
  gnome-settings-daemon \
  gnome-system-monitor \
  gnome-system-tools system-tools-backends\
  gnome-terminal \
  gnome-utils \
  gnome-vfs \
  gnome-vfs-plugin-bzip2 \
  gnome-vfs-plugin-computer \
  gnome-vfs-plugin-dns-sd \
  gnome-vfs-plugin-file \
  gnome-vfs-plugin-ftp \
  gnome-vfs-plugin-gzip \
  gnome-vfs-plugin-http \
  gnome-vfs-plugin-network \
  gnome-vfs-plugin-nntp \
  gnome-vfs-plugin-sftp \
  gnome-vfs-plugin-tar \
  gvfs \
  metacity \
  nautilus nautilus-actions nautilus-cd-burner desktop-file-utils gamin\
  networkmanager network-manager-applet networkmanager-openvpn \
  zenity \
 "

GSTREAMER = " \
  gst-ffmpeg \
  gst-omapfb \
  gst-plugin-pulse \
  gst-plugins-base-meta \
  gst-plugins-good-meta \
  gst-plugins-bad-meta \
  gst-plugins-ugly-meta \
#  task-gstreamer-ti \
"

UIM = " \
  uim \
  uim-common \
  uim-utils \
  uim-gtk2.0 \
  uim-anthy \
  uim-fep \
  uim-skk \
  uim-xim \
 "

PERL = " \
  perl \
  task-perl-module-all \
  libnet-dbus-perl \
  libxml-parser-perl \
  libxml-twig-perl \
"

PRINT = " \
  cups \
  cups-backend-hal \
#  cups-gs \
  gnome-cups-manager \
  gtk-printbackend-cups \
#  gutenprint \
  hal-cups-utils \
 "

PULSEAUDIO = " \
  pulseaudio \
  pulseaudio-alsa-wrapper \
  pulseaudio-esd-wrapper \
  pulseaudio-gconf-helper \
  pulseaudio-module-gconf \
  pulseaudio-module-alsa-sink \
  pulseaudio-module-alsa-source \
  pulseaudio-module-cli \
  pulseaudio-module-default-device-restore \
  pulseaudio-module-detect\
  pulseaudio-module-esound-protocol-unix \
  pulseaudio-module-simple-protocol-tcp \
  pulseaudio-module-native-protocol-unix \
  pulseaudio-module-cli-protocol-unix \
  pulseaudio-module-rescue-streams\
  pulseaudio-module-suspend-on-idle \
  pulseaudio-module-volume-restore \
  pulseaudio-module-oss \
  libasound-module-ctl-pulse \
  libasound-module-pcm-pulse \
 "

THEMES = " \
  gnome-icon-theme \
  gnome-themes \
  gnome-theme-crux \
  gnome-theme-highcontrast \
  gnome-theme-highcontrastinverse \
  gnome-theme-highcontrastlargeprint \
  gnome-theme-highcontrastlargeprintinverse \
  gnome-theme-largeprint \
  gnome-theme-mist \
  gtk-engine-clearlooks \
  gtk-engine-crux-engine \
  gtk-engine-glide \
  gtk-engine-hcengine \
  gtk-engine-thinice \
  gtk-engine-redmond95 \
  gtk-theme-clearlooks \
  gtk-theme-crux \
  gtk-theme-mist \
  gtk-theme-thinice \
  gtk-theme-redmond \
  hicolor-icon-theme \
  sound-theme-freedesktop \
 "

TOTEM = " \
  totem \
  totem-browser-plugin \
  totem-plugin-bemused \
  totem-plugin-gromit \
  totem-plugin-media-player-keys \
  totem-plugin-ontop \
  totem-plugin-properties \
  totem-plugin-screensaver \
  totem-plugin-skipto \
  totem-plugin-thumbnail \
 "

XSERVER_BASE = " \
  ${XSERVER} \
  dbus-x11 \
  desktop-file-utils \
  iso-codes \
  mime-support \
  notification-daemon inotify-tools \
  xauth \
  xdg-utils \
  xhost \
  xinetd \
  xinit \
  xlsfonts \
  xrandr \
  xrdb \
  xrefresh \
  xset \
  xvinfo \
 "

IMAGE_INSTALL += " \
  ${ANGSTROM_EXTRA_INSTALL} \
  ${APPS} \
  ${DEV} \
  ${FONTS} \
  ${GNOME} \
  ${GSTREAMER} \
  ${PERL} \
  ${PRINT} \
  ${PULSEAUDIO} \
  ${THEMES} \
  ${TOTEM} \
  ${SPLASH} \
  ${XSERVER_BASE} \
 "


