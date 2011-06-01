  2.6.32-psp-dsp
=======

This branch is for mt9p031 camera support with the linux-omap-psp-2.6.32 kernel.

You can pull this tree into your existing overo-oe repository this way.

	cd ${OVEROTOP}/org.openembedded.dev
	git remote add -f jumpnow git://github.com/scottellis/overo-oe.git
	git checkout -b 2.6.32-psp-dsp jumpnow/2.6.32-psp-dsp
	git branch -a
	* 2.6.32-psp-dsp
	org.openembedded.dev
	overo
	remotes/origin/HEAD -> origin/org.openembedded.dev
	remotes/origin/org.openembedded.dev
	remotes/origin/overo
	remotes/jumpnow/minimal
	...


And build it like this.

	cd ${OVEROTOP}
	bitbake -c clean virtual/kernel; bitbake virtual/kernel; bitbake camera-test-image


The camera-test-image has the gstreamer-ti stuff using dsplink included. I have been
using gstreamer commands like the following for testing:

Client on workstation (start this first)

	gst-launch -v udpsrc port=4000 caps="application/x-rtp, media=(string)video, clock-rate=(int)90000, encoding-name=(string)H264" ! rtph264depay ! ffdec_h264 ! xvimagesink sync=false


Server on the Overo

	gst-launch -v v4l2src ! video/x-raw-yuv,framerate=7/1,format=\(fourcc\)UYVY,width=640,height=480 ! ffmpegcolorspace ! TIVidenc1 codecName=h264enc engineName=codecServer ! rtph264pay pt=96 ! udpsink host=192.168.10.4 port=4000


Obviously you need a Gumstix board with network connectivity for this. I have only been using
Gumstix Tobi boards.

You need to add a mem=99M@0x80000000 kernel arg to u-boot. You can add an additional mem= arg if
you want to take advantage of more of the memory for Linux. For general camera testing that is not
necessary. I believe the default loadmodules.sh for the DSP cmem stuff only requires 16M starting 
at 0x86300000. For example when testing with an Overo Tide I sometimes add an additional 
mem=384M@0x88000000. For the other Overo boards the additional mem arg would be mem=128M@0x88000000.

The loadmodules.sh script can be found here on the gumstix

	/usr/share/ti/gst/omap3530/loadmodules.sh


You can use the gstreamer smoke encoder if you do not have the dsplink installed. Performance
is not as good, but it works. 

You can start these two commands in any order.

Client on workstation

	gst-launch udpsrc port=4000 ! smokedec ! autovideosink

Server on the Overo

	gst-launch -e v4l2src ! video/x-raw-yuv,format=\(fourcc\)YUY2,width=640,height=480 ! queue ! ffmpegcolorspace ! queue ! smokeenc ! udpsink host=192.168.10.4 port=4000


There are a several utility programs in my github account to help with testing the
mt9p031 camera. They all have READMEs and are fairly simple example apps.

	https://github.com/scottellis/snap.git
	https://github.com/scottellis/aewbctl.git
	https://github.com/scottellis/camctl.git
	https://github.com/scottellis/snapx.git

