# console image for omap3

inherit image

DEPENDS = "task-base task-sdk-native"

TI_DSP_INSTALL = " \
  task-gstreamer-ti \
  ti-codec-engine \
  ti-dmai \
  ti-dspbios \
  ti-dsplib \
  ti-dsplink \
  ti-dsplink-module \
  ti-cmem-module \
"

BASE_INSTALL = " \
  task-base-extended \
 "

FIRMWARE_INSTALL = " \
  libertas-sd-firmware \
 "

TOOLS_INSTALL = " \
  bzip2 \
  devmem2 \
  dhcp-client \
  dosfstools \
  fbgrab \
  fbset \
  fbset-modes \
  mkfs-jffs2 \
  mtd-utils \
  openssh-misc \
  openssh-scp \
  openssh-ssh \
  omap3-writeprom \
  procps \
  task-proper-tools \
  u-boot-utils \
 "

TOOLS_INSTALL += " \
  task-native-sdk \
 "

IMAGE_INSTALL += " \
  ${BASE_INSTALL} \
  ${FIRMWARE_INSTALL} \
  ${TOOLS_INSTALL} \
  ${TI_DSP_INSTALL} \
 "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

#ROOTFS_POSTPROCESS_COMMAND += '${@base_conditional("DISTRO_TYPE", "release", "zap_root_password; ", "",d)}'



